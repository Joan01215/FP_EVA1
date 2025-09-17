package eva1_11_operacioneslogisticas;

public class EVA1_11_OPERACIONESLOGISTICAS {

    public static void main(String[] args) {
        int radio=5;
        boolean resu;
        //operaciones logicas: comparaciones
        //resultado: verdadero o falso 
        resu = radio > 0;
        System.out.println("Radio (5) > 0 --->");
        System.out.println(resu);
        
        resu = radio < 0;
        System.out.println("Radio (5) < 0 --->");
        System.out.println(resu);
        
        resu = radio == 0;
        System.out.println("Radio (5) == 0 --->");
        System.out.println(resu);
        
        resu = radio != 0;
        System.out.println("Radio (5) != 0 --->");
        System.out.println(resu);
    }
    
}
