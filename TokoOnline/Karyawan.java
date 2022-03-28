import java.util.ArrayList;
public class Karyawan implements User{

    private ArrayList<String> namaKaryawan= new ArrayList<String>();
    private ArrayList<String> alamat= new ArrayList<String>();
    private ArrayList<String> telepon= new ArrayList<String>();
    private ArrayList<Integer> jabatan= new ArrayList<Integer>();

    public Karyawan(){
        this.namaKaryawan.add("Zeliq");
        this.alamat.add("Gresik");
        this.telepon.add("07387598");
        this.jabatan.add(0);

        this.namaKaryawan.add("Ipul");
        this.alamat.add("Malang");
        this.telepon.add("08395785");
        this.jabatan.add(1);
    }
        public void setJabatan(int jabatan ){ 
            this.jabatan.add(jabatan); 
        } 
        public int getJabatan(int id){ 
            return this.jabatan.get(id); 
        } 
        public int getJmlKaryawan(){ 
            return this.namaKaryawan.size(); 
        }
    
    @Override
    public void setNama(String nama) {
        // TODO Auto-generated method stub
        this.namaKaryawan.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        // TODO Auto-generated method stub
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        // TODO Auto-generated method stub
        this.alamat.add(telepon);
    }

    @Override
    public String getNama(int idKaryawan) {
        // TODO Auto-generated method stub
        return this.namaKaryawan.get(idKaryawan);
    }

    @Override
    public String getAlamat(int idKaryawan) {
        // TODO Auto-generated method stub
        return this.alamat.get(idKaryawan);
    }

    @Override
    public String getTelepon(int idKaryawan) {
        // TODO Auto-generated method stub
        return this.telepon.get(idKaryawan);
    }

}
