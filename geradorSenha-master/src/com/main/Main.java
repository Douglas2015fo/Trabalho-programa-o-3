package com.main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		
		gerarSenha();
		
	}

@SuppressWarnings({"resource"})
private static FileWriter gerarSenha() throws IOException{
		
		String caminhodefault = "D:\\Desktop\\secret_password.txt";
		Scanner scanner = new Scanner(System.in);
		int qtdeMinimaCaracteres = 0;
		int qtdeMaximaCaracteres = 0;
		String senha = new String();
		String maisucula, minuscula, numero, especial = "n";
		
	    String[] caracteresmaiusculo = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
	                "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W",
	                "X", "Y", "Z"};

	    String[] caracteresminusculo = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
	                "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
	                "x", "y", "z"};
	    
	    String[] caracteresnumero = {"1","2","3","4","5","6","7","8","9"};
	    
	    String[] caracteresEspecial = {"!","@","#","$","%","&","*"};
	   
	    System.out.println("Informe o caminho para salvar a senha: ");
	    caminhodefault = scanner.next();
	    
		FileWriter arq = new FileWriter(caminhodefault);
		PrintWriter gravarArq = new PrintWriter(arq);
		
		System.out.println("Digite a o tamanho minimo da senha: ");
		qtdeMinimaCaracteres = scanner.nextInt();
		
		System.out.println("Digite a o tamanho maximo da senha: ");
		qtdeMaximaCaracteres = scanner.nextInt();
		
		System.out.println("y - Sim, n - N�o");
		System.out.println("Deseja letra maiscula ?(y/n) ");
		maisucula = scanner.next();
		System.out.println("Deseja letra minuscula ?(y/n) ");
		minuscula = scanner.next();
		System.out.println("Deseja letra numero ?(y/n) ");
		numero = scanner.next();
		System.out.println("Deseja caracter especial ?(y/n) ");
		especial = scanner.next();
		
        while (qtdeMinimaCaracteres < qtdeMaximaCaracteres) {
        	
        	int escolhe = (int)(Math.random() * 4);
        	
        	if(escolhe == 0 ) {
        		if(maisucula.equals("y")) {
            		
            		int posicao = (int) (Math.random() * caracteresmaiusculo.length);
                    senha = senha + (caracteresmaiusculo[posicao]);
                    qtdeMinimaCaracteres++;
                    if(qtdeMinimaCaracteres == qtdeMaximaCaracteres) {
                    	break;
                    }
        		}
        	}
        	
        	if(escolhe == 1 ) {
        	if(minuscula.equals("y")) {
        		
            		int posicao = (int) (Math.random() * caracteresminusculo.length);
                    senha = senha + (caracteresminusculo[posicao]);
                    qtdeMinimaCaracteres++;
                    if(qtdeMinimaCaracteres == qtdeMaximaCaracteres) {
                		break;
                	}
        		}
        	}
        	
        	if(escolhe == 2 ) {
        	if(numero.equals("y")) {
        		
            		int posicao = (int) (Math.random() * caracteresnumero.length);
                    senha = senha + (caracteresnumero[posicao]);
                    qtdeMinimaCaracteres++;
                    if(qtdeMinimaCaracteres == qtdeMaximaCaracteres) {
                		break;
                	}
        		}
        	}
        	
        	if(escolhe == 3 ) {
        	if(especial.equals("y")) {
        		
            		int posicao = (int) (Math.random() * caracteresEspecial.length);
                    senha = senha + (caracteresEspecial[posicao]);
                    qtdeMinimaCaracteres++;
                    if(qtdeMinimaCaracteres == qtdeMaximaCaracteres) {
                		break;
                	}
        		}
        	}

        }
        
        gravarArq.write(senha);
        arq.close();
        System.out.println("Senha gerada no caminho : " + caminhodefault);
        return arq;
        		
	}

}

