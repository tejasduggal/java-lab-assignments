import java.awt.*;
 import java.awt.geom.Line2D;
 import javax.swing.*;
 
public class shape {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame f = new JFrame("Shapes");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.getContentPane().add(new DrawPanel());
            f.pack();
            f.setLocationRelativeTo(null);
            f.setVisible(true);
        });
    }

    static class DrawPanel extends JPanel {
        private final int PREF_W = 700;
        private final int PREF_H = 720;
        private final int margin = 28;
        private final int stripes = 36;
        private final Color bg = new Color(243, 243, 246);
        private final Color stroke = new Color(35, 50, 190);

        DrawPanel() {
            setPreferredSize(new Dimension(PREF_W, PREF_H));
            setBackground(bg);
        }

        @Override
        protected void paintComponent(Graphics g0) {
            super.paintComponent(g0);
            Graphics2D g = (Graphics2D) g0.create();
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);

            int w = getWidth();
            int h = getHeight() - 20;
            int top = margin;
            int left = margin;
            int right = w - margin;
            int bottom = h - margin;

            // outer rounded background
            g.setColor(new Color(230, 230, 235));
            g.fillRoundRect(left - 8, top - 8, right - left + 16, bottom - top + 16, 10, 10);
            g.setColor(bg);
            g.fillRect(left, top, right - left, bottom - top);

            // center square
            int centerX = (left + right) / 2;
            int centerY = (top + bottom) / 2;
            int innerSide = Math.min((right - left), (bottom - top)) / 6;
            int half = innerSide / 2;
            int innerLeft = centerX - half;
            int innerRight = centerX + half;
            int innerTop = centerY - half;
            int innerBottom = centerY + half;

            g.setColor(new Color(245, 245, 246));
            g.fillRect(innerLeft, innerTop, innerSide, innerSide);
            g.setColor(stroke);
            g.setStroke(new BasicStroke(1f));
            g.drawRect(innerLeft, innerTop, innerSide, innerSide);

            // outer corners
            Point topLeftOuter = new Point(left, top);
            Point topRightOuter = new Point(right, top);
            Point bottomLeftOuter = new Point(left, bottom);
            Point bottomRightOuter = new Point(right, bottom);

            // inner corner points
            Point topInnerLeft = new Point(innerLeft, innerTop);
            Point topInnerRight = new Point(innerRight, innerTop);
            Point bottomInnerLeft = new Point(innerLeft, innerBottom);
            Point bottomInnerRight = new Point(innerRight, innerBottom);

            g.setColor(stroke);

            // Draw stripes for four triangles (the functions now handle both directions)
            drawHorizontalStripes(g, topLeftOuter, topInnerLeft, topRightOuter, topInnerRight, stripes);
            drawHorizontalStripes(g, bottomLeftOuter, bottomInnerLeft, bottomRightOuter, bottomInnerRight, stripes);
            drawVerticalStripes(g, topLeftOuter, topInnerLeft, bottomLeftOuter, bottomInnerLeft, stripes);
            drawVerticalStripes(g, topRightOuter, topInnerRight, bottomRightOuter, bottomInnerRight, stripes);

            // outer border
            g.drawRect(left, top, right - left, bottom - top);

            g.dispose();
        }

        
        private void drawHorizontalStripes(Graphics2D g,
                                           Point leftOuter, Point leftInner,
                                           Point rightOuter, Point rightInner,
                                           int steps) {
            
            double yStart = Math.min(leftOuter.y, leftInner.y);
            double yEnd   = Math.max(leftOuter.y, leftInner.y);
            if (Math.abs(yEnd - yStart) < 1e-6) return;
            double dy = (yEnd - yStart) / steps;

            for (int i = 1; i <= steps; i++) {
                double y = yStart + i * dy;

                double denomL = (leftInner.y - leftOuter.y);
                double tLeft = denomL == 0 ? 0.0 : (y - leftOuter.y) / denomL;
                double xLeft = leftOuter.x + tLeft * (leftInner.x - leftOuter.x);

                double denomR = (rightInner.y - rightOuter.y);
                double tRight = denomR == 0 ? 0.0 : (y - rightOuter.y) / denomR;
                double xRight = rightOuter.x + tRight * (rightInner.x - rightOuter.x);

                g.draw(new Line2D.Double(xLeft, y, xRight, y));
            }
        }

        
        private void drawVerticalStripes(Graphics2D g,
                                         Point topOuter, Point topInner,
                                         Point bottomOuter, Point bottomInner,
                                         int steps) {
            double xStart = Math.min(topOuter.x, topInner.x);
            double xEnd   = Math.max(topOuter.x, topInner.x);
            if (Math.abs(xEnd - xStart) < 1e-6) return;
            double dx = (xEnd - xStart) / steps;

            for (int i = 1; i <= steps; i++) {
                double x = xStart + i * dx;

                double denomT = (topInner.x - topOuter.x);
                double tTop = denomT == 0 ? 0.0 : (x - topOuter.x) / denomT;
                double yTop = topOuter.y + tTop * (topInner.y - topOuter.y);

                double denomB = (bottomInner.x - bottomOuter.x);
                double tBottom = denomB == 0 ? 0.0 : (x - bottomOuter.x) / denomB;
                double yBottom = bottomOuter.y + tBottom * (bottomInner.y - bottomOuter.y);

                g.draw(new Line2D.Double(x, yTop, x, yBottom));
            }
        }
    }
}

