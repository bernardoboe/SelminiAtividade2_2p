import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
public class Util_ex1 {

	private Mercado_ex1[] prod = new Mercado_ex1[5];
	
	public void escolha(){
		
		int nav = 0;
		int cad = 0;
		while(nav != 5) {
			
			nav = parseInt(showInputDialog("Escolha uma opção: \r\n"
			        + "1.  Cadastrar produto \r\n"
					+ "2.  Pesquisar produto \r\n"
					+ "3.  Listar produto \r\n"
					+ "4.  Excluir produto \r\n"
					+ "5.  Finalizar "));
			
			if(nav == 1) {
				cad=cadastro();
			}
			
			if(nav == 2) {
				pesquisa(cad);
			}
			
			if(nav == 3) {
				listar(cad);
			}
			
			if(nav == 4) {
				excluir(cad);
			}
			
			
		}
		
	}

	public int cadastro(){
		
		int cad = 0;
			
		cad = parseInt(showInputDialog("Quantidade de produtos que serão cadastrados:"));
		if(cad> 10){
			while(cad>10) {
			showMessageDialog(null, "Valor inválido, o número máximo de produtos é 10.");
			cad = parseInt(showInputDialog("Quantidade de produtos que serão cadastrados:"));
			}
		}
		
			for (int i = 0; i < cad; i++) {
				prod[i] = new Mercado_ex1();
				prod[i].nomeProd = showInputDialog("Nome do Produto:");
				prod[i].preco = parseDouble(showInputDialog("Preço do Produto:"));
				prod[i].quantidade = parseInt(showInputDialog("Quantidade do Produto:"));
			
		}
			return cad;
	}
	
	public void pesquisa(int cad) {
		
		String pesq = "";
		
		pesq = showInputDialog("Nome do Produto:");
		
		for (int i = 0; i < cad; i++) {
			if(pesq.equalsIgnoreCase(prod[i].nomeProd)){
				
				showMessageDialog(null, prod[i].nomeProd + "\n R$" + String.format("%.2f", prod[i].preco) + "\n Unidades:" + prod[i].quantidade);
				
				return;
			}
			
		}
		showMessageDialog(null, "Produto não cadastrado.");
	}
	
	public void listar(int cad) {
		
		String lista = " ";
		
		
		if(cad==0) {
			showMessageDialog(null, "Não há produtos cadastrados");
		}else {
		for (int i = 0; i < cad; i++) {
		lista += "Produto: "  + prod[i].nomeProd + "\n R$" + String.format("%.2f", prod[i].preco) + "\n Unidades:" + prod[i].quantidade + "\n";
		}
		showMessageDialog(null, lista);
		
		return;
		}
	}

	public void excluir(int cad) {
		String pesq = "";
		
		pesq = showInputDialog("Nome do Produto:");
		
		for (int i = 0; i < cad; i++) {
			if(pesq.equalsIgnoreCase(prod[i].nomeProd)){
				prod[i] = new Mercado_ex1();
				prod[i].nomeProd = "---";
				prod[i].preco = 0;
				prod[i].quantidade = 0;
				
				showMessageDialog(null, "Produto excluído");
				
				return;
	}
			
		}
		
		showMessageDialog(null, "Produto não encontrado");
		
	}
}

	
