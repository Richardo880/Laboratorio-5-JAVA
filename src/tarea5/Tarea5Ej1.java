/*
    Grupo g20:  Diego Ramon Noguera Areco
                Ricardo Sebastian Toledo Barrios
*/


import java.util.ArrayList;

public class Tarea5Ej1 {

    public static void main(String[] args) {
        // definimos un arraylist de tipo Punto, nuestra clase, donde cargamos la coordenada x e y del punto en el plano
        ArrayList<Punto> Puntos = new ArrayList<>();//0(1)
        Puntos.add(new Punto(0, 0));//0(1)
        Puntos.add(new Punto(1, 1));//0(1)
        Puntos.add(new Punto(3, 3));//0(1)
        Puntos.add(new Punto(2, 2));//0(1)//cargamos los puntos

        int n = 4;//0(1)//definimos la cantidad de n puntos
        int i;//0(1)


        System.out.println("Puntos de la Primera prueba: ");
        for(i=0;i<n;i++){//0(N) ya que es un incremento lineal hasta n
            System.out.print(Puntos.get(i).coordenadaX+","+Puntos.get(i).coordenadaY+" ");//0(N)//imprimimos todos los puntos para visualizarlos
        }
        
        FuncionColinear.probarColinealidad(Puntos, n);//0(1)//llamamos a la funcion pasandole como parametro los puntos y la cantidad
        Puntos.clear();//0(1)//limpiamos el arraylist para las siguiente pruebas
        
        
        
        // PROBAMOS 2 VECES MAS CON EL MISMO PROCESO
        Puntos.add(new Punto(1, 0));//0(1)
        Puntos.add(new Punto(2, 1));//0(1)
        Puntos.add(new Punto(2, 3));//0(1)
        n = 3;//0(1)

        System.out.println("\nPuntos de la Segunda prueba: ");//0(1)
        for(i=0;i<n;i++){//0(N)
            System.out.print(Puntos.get(i).coordenadaX+","+Puntos.get(i).coordenadaY+" ");//0(N)
        }
        FuncionColinear.probarColinealidad(Puntos, n);//0(1)
        Puntos.clear();//0(1)
        
        
        
        //ULTIMA PRUEBA
        
        Puntos.add(new Punto(-4, -5));//0(1)
        Puntos.add(new Punto(0, -3));//0(1)
        Puntos.add(new Punto(8, 1));//0(1)
        Puntos.add(new Punto(4, 6));//0(1)

        n = 4;//0(1)


        System.out.println("Puntos de la Tercera prueba: ");
        for(i=0;i<n;i++){//0(N)
            System.out.print(Puntos.get(i).coordenadaX+","+Puntos.get(i).coordenadaY+" ");//0(N)
        }
        FuncionColinear.probarColinealidad(Puntos, n);//0(1)
        Puntos.clear();//0(1)
        
        //el tiempo de complejidad es de 0(N)
        
        
    }
    
}
