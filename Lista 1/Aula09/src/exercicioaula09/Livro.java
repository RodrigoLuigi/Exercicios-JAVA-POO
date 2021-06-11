package exercicioaula09;

public class Livro implements Publicacao {
    // Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
  
    // Construtor

    public Livro(String titulo, String autor, int totPaginas , Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }
    
    
    // Metodos Especiais
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    public void detalhes(){
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de Páginas: " + this.getTotPaginas());
        if (this.getAberto() == true){
        System.out.println("Status: aberto");
        }else{
            System.out.println("Status: fechado");
        }
        System.out.println("Página Atual: " + this.getPagAtual());
        System.out.println("Leitor: " + this.leitor.getNome());
    }

    /*public String detalhes() {
        return "Livro\n" + " titulo=" + titulo + "\n autor=" + autor + "\n totPaginas=" + totPaginas + 
                "\n pagAtual=" + pagAtual + "\n aberto=" + aberto + "\n leitor=" + leitor.getNome() ;
    }*/
    
    
    // Metodos Abstratos
    @Override
    public void abrir() {
       // System.out.println("Abrindo o livro!");
        //this.setPagAtual(0);
        this.setAberto(true);
        //System.out.println("Livro Aberto!");
        //System.out.println("Pág. " + this.getPagAtual());
    }

    @Override
    public void fechar() {
        //System.out.println("Fechando o livro!");
        this.setAberto(false);
        //System.out.println("Livro Fechado!");
    }

    @Override
    public void folhear(int p) {
       this.pagAtual = p;
    }

    @Override
    public void avancarPag() {
        System.out.println("Avançando Página!");
        this.setPagAtual(this.getPagAtual() + 1);
        System.out.println("Pág. " + this.getPagAtual());
        
    }

    @Override
    public void voltarPag() {
        System.out.println("Voltando a Página!");
        this.setPagAtual(this.getPagAtual() - 1);
        System.out.println("Pág. " + this.getPagAtual());
    }
    
    
}
