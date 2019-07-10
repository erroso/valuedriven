package figures;

import org.eclipse.draw2d.ImageFigure;
import activator.PluginActivator;
import java.io.InputStream;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.draw2d.ImageFigure;

/**
 * @generated
 */
public class MainActorFigure extends ImageFigure {

    public MainActorFigure() {
    	InputStream in = getClass().getResourceAsStream("images/mainActor.png");
   	   	Image image = new Image(Display.getDefault(), in);
    	this.setImage(image);
    	
   	
    	
//        super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
 //       		"images/mainActor.png").createImage(), 0);
        
        
        
    }

}



