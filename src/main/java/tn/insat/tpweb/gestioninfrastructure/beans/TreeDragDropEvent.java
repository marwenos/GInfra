package tn.insat.tpweb.gestioninfrastructure.beans;

import javax.faces.component.UIComponent;
import javax.faces.component.behavior.Behavior;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.AjaxBehaviorListener;
import javax.faces.event.FacesListener;
import org.primefaces.model.TreeNode;

public class TreeDragDropEvent extends AjaxBehaviorEvent {

private TreeNode[] dragNode;

private TreeNode dropNode;

private int dropIndex;

    public TreeDragDropEvent(UIComponent component, Behavior behavior, TreeNode[] dragNode, TreeNode dropNode, int dropIndex) {
            super(component, behavior);
            this.dragNode = dragNode;
    this.dropNode = dropNode;
    this.dropIndex = dropIndex;
    }

    @Override
    public boolean isAppropriateListener(FacesListener faceslistener) {
    return (faceslistener instanceof AjaxBehaviorListener);
    }

    @Override
    public void processListener(FacesListener faceslistener) {
            ((AjaxBehaviorListener) faceslistener).processAjaxBehavior(this);
    }

public TreeNode[] getDragNode() {
    return dragNode;
}

public TreeNode getDropNode() {
    return dropNode;
}

public int getDropIndex() {
    return dropIndex;
}

}
