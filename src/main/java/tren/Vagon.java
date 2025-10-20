package tren;

public class Vagon
{
    private int capacidad;
    private int carga;

    public Vagon(int capacidad)
    {
        this.capacidad = capacidad;
        this.carga = 0;
    }

    public int carga(int ton)
    {
        int cabe = capacidad-carga;
        int sobra = 0;

        if (ton >= cabe)
        {
            carga = capacidad;
            sobra = ton-cabe;
        }
        else
        {
            carga += ton;
        }
    return sobra;
    }
}
