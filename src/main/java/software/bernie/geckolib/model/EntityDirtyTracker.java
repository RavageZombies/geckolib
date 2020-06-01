package software.bernie.geckolib.model;

import java.util.ArrayList;

public class EntityDirtyTracker extends ArrayList<DirtyTracker>
{
	public DirtyTracker get(AnimatedModelRenderer bone)
	{
		return this.stream().filter(x -> x.model.name == bone.name).findFirst().orElseThrow(ArrayIndexOutOfBoundsException::new);
	}

}
