/*
    Grupo g20:  Diego Ramon Noguera Areco
                Ricardo Sebastian Toledo Barrios
*/


//DEFINIMOS LA CLASE PUNTO DONDE TENEMOS LAS COORDENADAS X E Y DE LOS PUNTOS QUE VAMOS CARGANDO
public class Punto {
    int coordenadaX, coordenadaY;//todos el codigo de tipo 0(1)
    Punto(int first, int second)//EL CONSTRUCTOR
    {
        this.coordenadaX = first;
        this.coordenadaY = second;
    }
    
    //SUS RESPECTIVOS GETTERS Y SETTERS
    public int getPrimero() {
        return coordenadaX;
    }

    public void setPrimero(int primero) {
        this.coordenadaX = primero;
    }

    public int getSegundo() {
        return coordenadaY;
    }

    public void setSegundo(int segundo) {
        this.coordenadaY = segundo;
    }
    
    
}

