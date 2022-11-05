package tugas1;

public class pegawai {
    private String name;
    private String address;
    private int number;
    
    public pegawai (String name, String address, int number){
        System.out.println("Menyusun Pegawai");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public void mailCheck(){
        System.out.println("Memeriksa surat untuk "+ this.name + " " +this.address);
    }

    public String to String(){
        return name + " " + address +   
    }

    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String newAddress){
        address = newAddress;
    }
    public int getNumber(){
        return number;
    }
}