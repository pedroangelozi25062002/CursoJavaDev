package br.com.curso.devmidia.utilizacaodasclasses;


import java.util.Date;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;

public class UsandoFormatacao {

    public static void main(String[] args) {
        
//        Date agora = new Date();
//
//        System.out.println( new SimpleDateFormat( "dd/MM/yyyy" ).format( agora )  );
//        System.out.println( new SimpleDateFormat( "EEEE, dd' de 'MMMMM' de 'yyyy" ).format( agora )  );
//        
//        
//        //entrada
//        String data = JOptionPane.showInputDialog( 
//                null,  "Digite uma data (dd/mm/aaaa)" );
//        
//        
//        //processamento
//        
//        try {
//            Date dataInform = new Date();
//            dataInform = new SimpleDateFormat( "dd/MM/yyyy" ).parse(data);
//        
//            //saída
//            JOptionPane.showMessageDialog( null, new SimpleDateFormat( "EEEE, dd' de 'MMMMM' de 'yyyy" ).format( dataInform ) );        
//        } catch( Exception e ) {
//            JOptionPane.showMessageDialog( null, "Erro no formato da data" );
//        }

        
        double result = 100000.0 / 3.0;
        
        System.out.println("Result: " + new DecimalFormat( "#,###.00" ).format(result) );
        
    }
}