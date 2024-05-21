import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.*;
import java.awt.*;

public class GUI extends JFrame{

    int spacing = 4;
    public int mx = -100;
    public int my = -100;

    public GUI() {
        this.setTitle("Minesweeper Arena");
        this.setSize(1286,829);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);

        Board board = new Board();
        this.setContentPane(board);

        Move move = new Move();
        this.addMouseMotionListener(move);
        Click click = new Click();
        this.addMouseListener(click);
    }
    public class Board extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.DARK_GRAY);
            g.fillRect(0,0,1280,800);

            for(int i=0; i < 16; i++){
                for(int j=0; j < 9; j++){
                    g.setColor(Color.gray);
                    if (mx>=spacing+i*80 && mx<spacing+i*80+80-2*spacing && my>=spacing+j*80+80+26 && my<spacing+j*80+26+80+80-2*spacing){
                        g.setColor(Color.lightGray);
                    }
                    g.fillRect(spacing+i*80,spacing+j*80+80,80-2*spacing, 80-2*spacing);
                }
            }
        }
    }

    public class Move implements MouseMotionListener {

        @Override
        public void mouseDragged(MouseEvent e) {

        }

        @Override
        public void mouseMoved(MouseEvent e) {
            mx = e.getX();
            my = e.getY();
        }
    }

    public class Click implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
}
