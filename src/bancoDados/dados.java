/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoDados;
import login_registro.telaLogin;
/**
 *
 * @author FakeKing
 */
public class dados {
    public static String user[] = new String[100];
    public static String password[] = new String[100];
    public static int position;
    
    public static void main(String[] args) {
        telaLogin cn = new telaLogin();
        cn.setVisible(true);
    }
}
