package utils;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Input {
    public static Scanner scan = new Scanner(System.in);

    public static int in(String msg) {
        while (true) {
            try {
                System.out.println(msg);
                String s = scan.nextLine().trim();
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Tente novamente.");
            }
        }
    }

    public static double db(String msg) {
        while (true) {
            try {
                System.out.println(msg);
                String s = scan.nextLine().trim().replace(",", ".");
                return Double.parseDouble(s);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Tente novamente.");
            }
        }
    }

    public static float ft(String msg) {
        while (true) {
            try {
                System.out.println(msg);
                String s = scan.nextLine().trim().replace(",", ".");
                return Float.parseFloat(s);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Tente novamente.");
            }
        }
    }

    public static String st(String msg) {
        System.out.println(msg);
        String line = scan.nextLine();
        while (line.trim().isEmpty()) {
            System.out.print(msg);
            line = scan.nextLine();
        }
        return line.trim();
    }

    public static int inGui(String msg) {
        while (true) {
            try {
                String s = JOptionPane.showInputDialog(null, msg);
                if (s == null) {
                    throw new IllegalArgumentException("Entrada cancelada pelo usuário.");
                }
                return Integer.parseInt(s.trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Valor inválido! Digite um número inteiro.",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static double dbGui(String msg) {
        while (true) {
            try {
                String s = JOptionPane.showInputDialog(null, msg);
                if (s == null) {
                    throw new IllegalArgumentException("Entrada cancelada pelo usuário.");
                }
                return Double.parseDouble(s.trim().replace(",", "."));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Valor inválido! Digite um número real.",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static float ftGui(String msg) {
        while (true) {
            try {
                String s = JOptionPane.showInputDialog(null, msg);
                if (s == null) {
                    throw new IllegalArgumentException("Entrada cancelada pelo usuário.");
                }
                return Float.parseFloat(s.trim().replace(",", "."));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Valor inválido! Digite um número real.",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static String stGui(String msg) {
        while (true) {
            String s = JOptionPane.showInputDialog(null, msg);
            if (s == null) {
                throw new IllegalArgumentException("Entrada cancelada pelo usuário.");
            }
            s = s.trim();
            if (!s.isEmpty()) {
                return s;
            }

            JOptionPane.showMessageDialog(null,
                    "Texto inválido! Digite um valor não vazio.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void msgGui(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public static void close() {
        scan.close();
    }
}