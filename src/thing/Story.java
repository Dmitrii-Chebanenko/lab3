package thing;

import intefaces.PartOfStory;

import java.util.Objects;

public class Story extends Thing {

    private PartOfStory StoryAbout;
    public Story() {
        super();
    }

    public Story(String name){
        super(name);
    }

    public void setStoryThing(PartOfStory thing) {
        this.StoryAbout = thing;
    }

    @Override
    public void equate(Thing thing) {
        if (thing.getClass() == this.getClass()){
            super.equate(thing);
            this.StoryAbout = StoryAbout;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Story story = (Story) o;
        return Objects.equals(StoryAbout, story.StoryAbout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), StoryAbout);
    }


    @Override
    public String toString() {
        String result = super.toString();
        result = result.substring(0, result.length() - 1);
        return result + " " + this.StoryAbout + "]";
    }


    @Override
    public String superToString() {
        return getStatusToString() + " " + this.getName()  + " " + StoryAbout.superToString();
    }
}
