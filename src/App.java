import java.util.List;
import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args){
        var menu = "1 - Cadastrar\n2 - Visualizar\n3 - Aatualizar\n4 - Remover\n0 - Sair";
        int opcao;
        do{
            opcao =  Integer.parseInt(JOptionPane.showInputDialog(menu));
            try{
                switch(opcao){
                    case 1: {
                        var nome = JOptionPane.showInputDialog("Nome?");
                        var fone = JOptionPane.showInputDialog("Fone?");
                        var email = JOptionPane.showInputDialog("Email?");
                        var pessoa = Pessoa.builder()
                            .nome(nome)
                            .fone(fone)
                            .email(email)
                            .build();
                        var dao =  new PessoaDA0();
                        dao.cadastrar(pessoa);
                        JOptionPane.showMessageDialog(null, "Cadastro ok!");
                        break;
                    }
                    case 2:{
                        List <Pessoa> pessoas = PessoaDA0.listar();
                        // for it ou enhanced for
                        var sb = new StringBuilder("");
                        for(Pessoa pessoa : pessoas){
                            System.out.println(pessoa);
                            sb.append(pessoa).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, sb.toString());
                        break;
                    }
                    case 3:{
                        var codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo?"));
                        var nome = JOptionPane.showInputDialog("Nome?");
                        var fone = JOptionPane.showInputDialog("Fone?");
                        var email = JOptionPane.showInputDialog("Email?");
                        var p = Pessoa.builder().codigo(codigo).nome(nome).fone(fone).email(email).build();
                        var dao = new PessoaDA0();
                        dao.atualizar(p);
                        JOptionPane.showMessageDialog(null, "Atualização OK!");
                        break;
                    }
                    case 4:{
                        var codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo?"));
                        var p = Pessoa.builder().codigo(codigo).build();
                        var dao = new PessoaDA0();
                        dao.apagar(p);
                        JOptionPane.showMessageDialog(null, "Exclusão OK!"); 
                    }
                }
            }
            catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Tente novamente mais tarde");
            }
        }while(opcao != 0);

    }
}
