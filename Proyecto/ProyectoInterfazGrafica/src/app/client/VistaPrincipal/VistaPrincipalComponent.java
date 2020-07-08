package app.client.VistaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaPrincipalComponent implements ActionListener{

    private VistaPrincipalTemplate vistaPrincipalTemplate;
    
    public VistaPrincipalComponent(){
        this.vistaPrincipalTemplate = new VistaPrincipalTemplate(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    public VistaPrincipalTemplate getVistaPrincipalTemplate() {
        return vistaPrincipalTemplate;
    }

}
