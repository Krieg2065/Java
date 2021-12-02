package multimediale;

import java.util.Scanner;

public class TestMultimedia {

    public static void main(String[] args) {
        System.out.println("LETTORE MULTIMEDIALE");
        Scanner in = new Scanner(System.in);
        Multimedia[] multi = new Multimedia[5];
        int scelta = 0;
        do {
            System.out.println("=============");
            System.out.println("    MENU   ");
            System.out.println("=============");
            System.out.println("Scegli elemento multimediale: ");
            System.out.println("1) Foto ");
            System.out.println("2) Filmato  ");
            System.out.println("3) Audio  ");
            System.out.println("4) Filmato  ");
            System.out.println("5) Filmato ");
            System.out.println("0) ESCI ");
            scelta = in.nextInt();
            switch (scelta) {

            case 1:
                multi[0] = new Immagine("foto",0);
                Immagine immagine = new Immagine("Foto",0);
                immagine.darker(3);
                immagine.show();
                break;

            case 2:
                multi[1] = new Filmato("Filmato", 6, 10, 8);
                Filmato filmato1 = new Filmato("Filmato", 6, 10, 10);
                filmato1.darker(4);
                filmato1.weaker(15);
                filmato1.play();
                break;

            case 3:
                Audio audio = new Audio("Audio", 15, 8);
                audio.louder(4);
                audio.play();
                break;

            case 4:
                Filmato filmato2 = new Filmato("Filmato", 6, 10, 10);
                filmato2.darker(4);
                filmato2.weaker(15);
                filmato2.play();
                break;

            case 5:
                Filmato film = new Filmato("Filmato", 6, 10, 10);
                film.darker(4);
                film.weaker(15);
                film.play();
                break;
            }
        } while (scelta != 0);
        System.out.println("exit");
    }
}
