package br.com.app.videoaulasandroid;

/**
 * Created by Billy on 17/03/2016.
 */
public class Video {

    private String[] titleVideo;
    private String[] subTitle;
    private String[] duration;
    private String[] keyTube;
    private Integer[] imagem;

    public Video(){
        this.titleVideo = new String[]{
                "Curso de Android - Aula 1",
                "Curso de Android - Aula 2",
                "Curso de Android - Aula 3",
                "Curso de Android - Aula 4",
                "Curso de Android - Aula 5",
                "Curso de Android - Aula 6",
                "Curso de Android - Aula 7",
                "Curso de Android - Aula 8",
                "Curso de Android - Aula 9",
                "Curso de Android - Aula 10",
                "Curso de Android - Aula 11",
                "Curso de Android - Aula 12",
                "Curso de Android - Aula 13",
                "Curso de Android - Aula 14",
                "Curso de Android - Aula 15",
                "Curso de Android - Aula 16",
                "Curso de Android - Aula 17",
                "Curso de Android - Aula 18",
                "Curso de Android - Aula 19",
                "Curso de Android - Aula 20"
        };

        this.subTitle = new String[]{
                "Instalação do Android",
                "Primeiro Projeto",
                "Emulador",
                "Estrutura de Pastas",
                "Activity, View, LogCat - parte 1",
                "Activity, View, LogCat - parte 2",
                "XML",
                "Gerenciadores de Layout I",
                "Gerenciadores de Layout II",
                "Gerenciadores de Layout III",
                "LinearLayout II",
                "Gerenciadores de Layout",
                "LinearLayout IV",
                "Calculadora",
                "Calculadora II",
                "Calculadora III",
                "Calculadora IV",
                "string.xm",
                "Toast ",
                "AndroidManifest.xm",
                "Activity I",
                "Activity II",
                "Classe R",
                "Menu",
                "Activity & Menu",
        };

        this.keyTube = new String[]{
                "stmPydPcDAQ",
                "oBHrtUrq9p0",
                "MKHffejfugQ",
                "CBLDvBLoE6w",
                "thC3dezbKXs",
                "CisDKrxYP9M",
                "aB5-Kb29U2Q",
                "3Gfx7tH6rQY",
                "e6xsAVfV3zo",
                "DlPIn5FDl_Y",
                "VR2O6PpEYhA",
                "kgZEm3Wns4E",
                "IZ0wRgf8EAc",
                "z8z1ZtqU60Q",
                "SUYWYHZvoqo",
                "4XgWcO_tapo",
                "U_D7rxDRGNw",
                "0eHrYm7AG54",
                "0QI3cSP9zi4",
                "gQFq3HFh8qY",
                "iqTQBRrs5E4",
                "w046yN15XeI",
                "MEegto1_GpM",
                "Kz_JqWukVGw",
                "kRYHHyJk44k"
        };

        this.duration = new String[]{
                "5:32",
                "4:53",
                "7:22",
                "4:18",
                "6:34",
                "6:08",
                "5:58",
                "3:57",
                "4:12",
                "9:12",
                "6:55",
                "5:27",
                "6:59",
                "6:54",
                "6:38",
                "4:45",
                "5:34",
                "5:58",
                "6:45",
                "6:32",
                "9:02",
                "5:09",
                "5:01",
                "6:16",
                "7:25",
        };

        this.imagem = new Integer[]{
                R.drawable.icon_video,
                R.drawable.icon_video,
                R.drawable.icon_video,
                R.drawable.icon_video,
                R.drawable.icon_video,
                R.drawable.icon_video,
                R.drawable.icon_video,
                R.drawable.icon_video,
                R.drawable.icon_video,
                R.drawable.icon_video,
                R.drawable.icon_video,
                R.drawable.icon_video,
                R.drawable.icon_video,
                R.drawable.icon_video,
                R.drawable.icon_video,
                R.drawable.icon_video,
                R.drawable.icon_video,
                R.drawable.icon_video,
                R.drawable.icon_video,
                R.drawable.icon_video,
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

    public String[] getKeyTube() {
        return keyTube;
    }

    public void setKeyTube(String[] keyTube) {
        this.keyTube = keyTube;
    }
}
