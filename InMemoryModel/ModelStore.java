package InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

public class ModelStore implements IModelChanger{
    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private List<IModelChangedObserver> changedObservers;
    
    public ModelStore(List<IModelChangedObserver> changedObservers) throws Exception{
        this.changedObservers = changedObservers;
        this.Models = new ArrayList<>();
        Models.add(new PoligonalModel(null));
        this.Scenes = new ArrayList<>();
        Scenes.add(new Scene(0, Models, Flashes, Cameras));
        this.Flashes = new ArrayList<>();
        Flashes.add(new Flash(null, null, null, 0));
        this.Cameras = new ArrayList<>();
        Cameras.add(new Camera(null, null));
    }

    public Scene getScenes(int id){
        for (int i = 0; i < Scenes.size(); i++) {
            if(Scenes.get(i).id==id){
                return Scenes.get(i);
            }
        } return null;
    }

    @Override
    public void NotifyChange(IModelChanger sender) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'NotifyChange'");
    }

}