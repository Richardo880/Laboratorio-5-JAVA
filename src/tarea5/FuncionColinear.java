/*
    Grupo g20:  Diego Ramon Noguera Areco
                Ricardo Sebastian Toledo Barrios
*/


import java.util.ArrayList;


public class FuncionColinear {
    static void probarColinealidad(ArrayList<Punto> listaPuntos, int n)//FUNCION QUE RECIBE COMO PARAMETRO LOS PUNTOS Y LA CANTIDAD Y DETERMINA LA COLINEALIDAD DE ESTOS
    {   
     
        // los primeros puntos x0 e y0
        int x0 = listaPuntos.get(0).coordenadaX;//0(1)
        int y0 = listaPuntos.get(0).coordenadaY;//0(1)

        // los segundos puntos x1 e y1
        int x1 = listaPuntos.get(1).coordenadaX;//0(1)
        int y1 = listaPuntos.get(1).coordenadaY;//0(1)
        
        
        int distanciaX = x1 - x0, distanciaY = y1 - y0;//0(1) calculamos la distancia tanto x e y de ambos puntos en el plano
        
        // recorremos nuestra lista de puntos
        System.out.println("\nPuntos colineales: ");
        for(int i = 0; i < n; i++)// tipo O(N) son todas las operaciones dentro del for ya que es un incremento lineal hasta n
        {
            int x = listaPuntos.get(i).coordenadaX;//0(N)
            int y = listaPuntos.get(i).coordenadaY;//0(N)//obtenemos las coordenadas del punto de nuestra lista
            //utilizamos la siguiente formula despejada de la formula de distancia entre 2 puntos para determinar la colinealidad
            if (distanciaX * (y - y1) != distanciaY * (x - x1))//0(N) //si no son iguales se concluye que estos puntos no son colineales
            {
                System.out.println("\n"+x+","+y+" NO son colineales");//0(N)//imprimimos con un mensaje indicandonos
            }else{
                System.out.print(x+","+y+" ");//0(N)//si son iguales imprimimos los puntos que si son colineales
            }
        }
        System.out.println("\n");//0(1)
        //el tiempo de complejidad es de 0(N)
    }   
}
