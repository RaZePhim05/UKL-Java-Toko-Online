import java.util.ArrayList;
public class Member implements User{

    private ArrayList<String> namaMember= new ArrayList<String>();
    private ArrayList<String> alamat= new ArrayList<String>();
    private ArrayList<String> telepon= new ArrayList<String>();
    private ArrayList<Integer> saldo= new ArrayList<Integer>();

    public Member(){
        this.namaMember.add("Ipan");
        this.alamat.add("Blitar");
        this.telepon.add("09248902");
        this.saldo.add(10000000);

        this.namaMember.add("Atta");
        this.alamat.add("Malang");
        this.telepon.add("082749827");
        this.saldo.add(2000000);

        this.namaMember.add("Alif");
        this.alamat.add("Jombang");
        this.telepon.add("0819208408");
        this.saldo.add(4000000);
    }

    public void setSaldo(int saldo){
        this.saldo.add(saldo);
    }
    public int getSaldo(int idMember){
        return this.saldo.get(idMember);
    }
    public void editSaldo(int saldo, int idMember){
        this.saldo.set(saldo, idMember);
    }
    public int getJmlMember(){
        return this.namaMember.size();
    }

    @Override
    public String getAlamat(int idMember) {
        // TODO Auto-generated method stub
        return this.alamat.get(idMember);
    }

    @Override
    public String getNama(int idMembe) {
        // TODO Auto-generated method stub
        return this.namaMember.get(idMembe);
    }

    @Override
    public String getTelepon(int idMembe) {
        // TODO Auto-generated method stub
        return this.telepon.get(idMembe);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setNama(String namaMember) {
        this.namaMember.add(namaMember);
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
        // TODO Auto-generated method stub
        
    }

}
