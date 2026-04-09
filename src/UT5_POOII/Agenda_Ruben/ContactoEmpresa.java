package UT5_POOII.Agenda_Ruben;

public class ContactoEmpresa extends Contacto {
    private String pagWeb;

    public ContactoEmpresa(String nombre, String numTel, String pagWeb) {
        super(nombre, numTel);
        this.pagWeb = pagWeb;
    }

    public String getPagWeb() {return pagWeb;}
    public void setPagWeb(String pagWeb) {this.pagWeb = pagWeb;}

    public String getTelefono() {
        String telefono;
        telefono = "+34 " + getNumTel().substring(0,3) + " " + getNumTel().substring(3,6) + " " + getNumTel().substring(6,9);
        return telefono;
    }

    public void llamar() {
        System.out.println("LLAMANDO A " + getNombre() + " AL NÚMERO " + getTelefono() + " ... \nPULSE 1 PARA ATENCION AL CLIENTE, 2 PARA SOPORTE TÉCNICO..." );
    }
}
