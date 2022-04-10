package br.com.curso.devmidia.utilizacaodasclasses;


import java.util.Date;
import javax.swing.JOptionPane;

public class UsandoDataHora {

    public static void main(String[] args) {
        
        
//        String texto = "Ola Mundo";
//        
//        Date agora = new Date();
//
//        int dia = agora.getDate();
//        int mes = agora.getMonth();
//        int ano = (agora.getYear()+1900);
//        
//        int hora = agora.getHours();
//        int minuto = agora.getMinutes();
//        
//        System.out.println( dia + "/" + mes + "/" + ano  );
//        
//        String formatoExtenso = agora.toString();
//        System.out.println( formatoExtenso );
        
        //entrada
        String data = JOptionPane.showInputDialog( 
                null,  "Digite uma data (dd/mm/aaaa)" );
        
        String meses[] = { "janeiro",  "fevereiro", "março",
            "abril","maio","junho","julho","agosto","setembro",
            "outubro","novembro","dezembro"
        };
        
        String diasDaSemana[] = { "Domingo", "segunda-feira",
            "terça-feira", "quarta-feira", "quinta-feira", 
            "sexta-feira", "sabado"
        };
        
        //processamento
        String parte[] = data.split( "/" );
        int dia = Integer.parseInt( parte[0] );
        int mes = Integer.parseInt( parte[1] );
        int ano = Integer.parseInt( parte[2] );
        
        Date date = new Date();
        date.setDate( dia );
        date.setMonth( (mes - 1) );
        date.setYear( (ano - 1900 ) );
        
        int diaDaSemana = date.getDay();
        
        String diaSemanaExtenso = diasDaSemana[diaDaSemana];
        
        
        String mesExtenso = meses[ mes - 1 ];
        
        //saída
        JOptionPane.showMessageDialog( null, diaSemanaExtenso +  ", " + 
                parte[0] + " de " + 
                mesExtenso + " de " + parte[2] );        

    }
}
