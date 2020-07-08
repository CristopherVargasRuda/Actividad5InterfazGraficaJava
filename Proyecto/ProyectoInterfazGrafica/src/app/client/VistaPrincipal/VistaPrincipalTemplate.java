package app.client.VistaPrincipal;

import javax.swing.JFrame;
import app.services.RecursosService;
import app.services.ObjGraficosService;
import java.awt.Color;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

public class VistaPrincipalTemplate extends JFrame{
    
    private VistaPrincipalComponent vistaPrincipalComponent;
    private RecursosService sRecursos;
    private ObjGraficosService sObjGraficos;
    private JPanel pNavegacion, pBarra, pPrincipal;
    
    public VistaPrincipalTemplate(VistaPrincipalComponent vistaPrincipalComponent){
    super("Vista Principal");
        
        this.vistaPrincipalComponent = vistaPrincipalComponent;
        
        sRecursos = RecursosService.getService();
        sObjGraficos = ObjGraficosService.getService();
    
        crearJPanels();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 650);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
    }
    
    public void crearJPanels(){
        pNavegacion = sObjGraficos.construirJPanel(0, 0, 250, 700, sRecursos.getColorFondo(), null);
        this.add(pNavegacion);

        pBarra = sObjGraficos.construirJPanel(250, 0, 950, 50,sRecursos.getColorSpotify(), null);
        this.add(pBarra);

        pPrincipal = sObjGraficos.construirJPanel(250, 50, 950, 600, Color.WHITE, null);
        this.add(pPrincipal);
    }
}
