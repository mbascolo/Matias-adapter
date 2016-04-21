package adapter.matias.com.matias_adapter;

/**
 * Creado por Hermosa Programación el 18/01/2015.
 */
public class Producto {
    private String nroPool;
    private String descripcion;
    private String pathImagenBannerMiniatura;

    public Producto(){
    }

    public Producto(String nroPool, String descripcion, String pathImagenBannerMiniatura) {
        this.nroPool = nroPool;
        this.descripcion = descripcion;
        this.pathImagenBannerMiniatura = pathImagenBannerMiniatura;
    }

    public String getNroPool() {
        return nroPool;
    }

    public void setNroPool(String nroPool) {
        this.nroPool = nroPool;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPathImagenBannerMiniatura() {
        return pathImagenBannerMiniatura;
    }

    public void setPathImagenBannerMiniatura(String pathImagenBannerMiniatura) {
        this.pathImagenBannerMiniatura = pathImagenBannerMiniatura;
    }
}
