package exerciciosdainternet.encapsulamento;

public class ExecEncapTest {
    public static void main(String[] args) {
        EncapTest encap = new EncapTest();
        encap.setName("João");
        encap.setAge(20);
        encap.setIdNum("1234ms");

        System.out.println(" Name: " +encap.getName()+ " Age " +encap.getAge());
    }
}
