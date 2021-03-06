package app.services;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;


public class RecursosService {
    
        private Color colorFondo, colorSpotify, colorGris;
        private Font fontTPrincipal, fontTitulo, fontSubtitulo, fontBoton, fontNotificacion, fontPanel, fontCondiciones;
        private Cursor cMano;
        private ImageIcon iCerrar, iMaximizar, iMinimizar;
        private Border bordeVerde, bordeGris;

    
    static private RecursosService servicio;
    
    private RecursosService(){
        
        iCerrar = new ImageIcon("resources/img/botonRojo.png");
        iMaximizar = new ImageIcon("resources/img/botonAmarillo.png");
        iMinimizar = new ImageIcon("resources/img/botonVerde.png");
        
        colorFondo = new Color(24, 26, 27);
        colorSpotify = new Color(25, 158, 72);
        colorGris = new Color (57, 59, 62);

        fontTPrincipal = new Font("Arial Rounded MT Bold", Font.PLAIN, 32);
        fontTitulo = new Font("Arial Rounded MT Bold", Font.PLAIN, 16);
        fontSubtitulo = new Font("book antiqua", Font.PLAIN, 15);
        fontNotificacion = new Font("book antiqua", Font.PLAIN, 17);
        fontBoton = new Font("arial black", Font.PLAIN, 15);
        fontPanel = new Font("Times New Roman", Font.PLAIN, 17);
        fontCondiciones = new Font("Times New Roman black", Font.PLAIN, 9);
        
        cMano = new Cursor(Cursor.HAND_CURSOR);
        
        bordeVerde = BorderFactory.createMatteBorder(0, 0, 2, 0, colorSpotify);
        bordeGris = BorderFactory.createMatteBorder(0, 0, 1, 0, colorGris);
    }
    
    public static RecursosService getService(){
        if(servicio == null){
            servicio = new RecursosService();
        }
        return servicio;
    }

    public Color getColorFondo() {
        return colorFondo;
    }

    public Color getColorSpotify() {
        return colorSpotify;
    }

    public Color getColorGris() {
        return colorGris;
    }

    public Font getFontTPrincipal() {
        return fontTPrincipal;
    }

    public Font getFontTitulo() {
        return fontTitulo;
    }

    public Font getFontSubtitulo() {
        return fontSubtitulo;
    }

    public Font getFontBoton() {
        return fontBoton;
    }

    public Font getFontNotificacion() {
        return fontNotificacion;
    }

    public Font getFontPanel() {
        return fontPanel;
    }

    public Font getFontCondiciones() {
        return fontCondiciones;
    }

    public Cursor getcMano() {
        return cMano;
    }

    public ImageIcon getiCerrar() {
        return iCerrar;
    }

    public ImageIcon getiMaximizar() {
        return iMaximizar;
    }

    public ImageIcon getiMinimizar() {
        return iMinimizar;
    }

    public Border getBordeVerde() {
        return bordeVerde;
    }

    public Border getBordeGris() {
        return bordeGris;
    }

    public static RecursosService getServicio() {
        return servicio;
    }

    
}
