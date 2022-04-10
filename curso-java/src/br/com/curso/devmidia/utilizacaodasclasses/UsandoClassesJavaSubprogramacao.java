package br.com.curso.devmidia.utilizacaodasclasses;


import java.util.Date;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;

public class UsandoClassesJavaSubprogramacao {

    public static void main(String[] args) {
        
        Date agora = new Date();

        String dataFormat = getDataFormatada( agora );
        
        System.out.println( dataFormat  );
        
        String formatoExtenso = agora.toString();
        System.out.println( formatoExtenso );
        
        //entrada
        String data = JOptionPane.showInputDialog( 
                null,  "Digite uma data (dd/mm/aaaa)" );
        
        //processamento
        
        String dataExtenso = getDataExtenso( data );
        
        
        //saída
        JOptionPane.showMessageDialog( null, dataExtenso );   

        

    }
    
    public static String getDataFormatada( Date data ) {
        
        
        int dia = data.getDate();
        int mes = data.getMonth()+1;
        int ano = (data.getYear()+1900);
        
        String retorno = ( dia + "/" + mes + "/" + ano  );        
        return retorno;
        
    }
    
    public static String getDataExtenso( String data ) {
        
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
        return ( diaSemanaExtenso +  ", " + 
                parte[0] + " de " + 
                mesExtenso + " de " + parte[2] );   
        
    }
}
