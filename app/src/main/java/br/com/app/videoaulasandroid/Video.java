package br.com.app.videoaulasandroid;

/**
 * Created by Billy on 17/03/2016.
 */
public class Video {

    private String[] titleVideo;
    private String[] subTitle;
    private String[] duration;
    private Integer[] imagem;

    public Video(){
        this.titleVideo = new String[]{
                "Curso de Android - Aula 1",
                "Curso de Android - Aula 2",
                "Curso de Android - Aula 3",
                "Curso de Android - Aula 4",
                "Curso de Android - Aula 5"
        };

        this.subTitle = new String[]{
                "Instalação do Android",
                "Primeiro Projeto",
                "Emulador",
                "Estrutura de Pastas",
                "Activity"
        };

        this.duration = new String[]{
                "5:32",
                "4:53",
                "7:22",
                "4:18",
                "6:34"
        };

        this.imagem = new Integer[]{
                R.drawable.icon_video,
                R.drawable.icon_video,
                R.drawable.icon_video,
                R.drawable.icon_video,
                R.drawable.icon_video,
        };
    }

    public void setTitleVideo(String[] titleVideo) {
        this.titleVideo = titleVideo;
    }

    public String[] getTitleVideo() {
        return titleVideo;
    }

    public void setSubTitle(String[] subTitle) {
        this.subTitle = subTitle;
    }

    public String[] getSubTitle() {
        return subTitle;
    }

    public void setDuration(String[] duration) {
        this.duration = duration;
    }

    public String[] getDuration() {
        return duration;
    }


    public void setImagem(Integer[] imagem) {
        this.imagem = imagem;
    }

    public Integer[] getImagem() {
        return imagem;
    }

}
