public enum TipoCuenta {
    Ahorro("Cuenta de ahorra"),
    Plantilla ("Cuenta de plantilla"),
    Cheque ("Cuenta de cheques"),
    Aportaciones ("Cuenta de apotartaciones"),
    Credito ("Cuenta de credito");

    private String descripcion;

    private TipoCuenta(String descripcion) {
        this.descripcion = descripcion;
    }

    private TipoCuenta(){
        this.descripcion = "Cuenta sin especificar";
    }

    
}
