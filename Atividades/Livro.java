public class Livro {
    private String titulo;
    private String autor;
    private int paginas;
    private String genero;
    private Livro(LivroBuilder builder){
        this.titulo = builder.titulo;
        this.autor = builder.autor;
        this.paginas = builder.paginas;
        this.genero = builder.genero;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getPaginas(){
        return paginas;
    }
    public String getGenero(){
        return genero;
    }
    @Override
    public String toString(){
        return "Livro [Título: " + titulo + ", Autor: " + autor + ", Páginas: " + paginas + ", Gênero: " + genero + "]";
    }



    public static class LivroBuilder{
        private String titulo;
        private String autor;
        private int paginas;
        private String genero;

        public LivroBuilder setTitulo(String titulo){
            this.titulo = titulo;
            return this;
        }
        public LivroBuilder setAutor(String autor){
            this.autor = autor;
            return this;
        }
        public LivroBuilder setPaginas(int paginas){
            this.paginas = paginas;
            return this;
        }
        public LivroBuilder setGenero(String genero){
            this.genero = genero;
            return this;
        }
        public Livro build(){
            return new Livro(this);
        }
    }
}
