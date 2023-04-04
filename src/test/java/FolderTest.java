import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FolderTest {

    Folder folder1;
    Folder folder2;

    @BeforeEach
    public void setUp() {
        folder1 = new Folder("Ringbinder", "Lilac", 4, false, "Cardboard");
        folder2 = new Folder("Card folder", "Red", 2, true, "Card");
    }

    @Test
    public void folderGetters() {
        assertThat(folder1.getPrice()).isEqualTo(4);
        assertThat(folder2.getName()).isEqualTo("Card folder");
        assertThat(folder1.getMaterial()).isEqualTo("Cardboard");
        assertThat(folder2.isCompact()).isEqualTo(true);
        assertThat(folder1.getColour()).isEqualTo("Lilac");
    }

    @Test
    public void folderSetters(){
        folder1.setName("Button folder");
        assertThat(folder1.getName()).isEqualTo("Button folder");
        folder1.setCompact(false);
        assertThat(folder1.isCompact()).isEqualTo(false);
        folder1.setMaterial("Plastic");
        assertThat(folder1.getMaterial()).isEqualTo("Plastic");
    }

    @Test
    public void canAddLabels() {
        assertThat(folder1.addLabels()).isEqualTo("Label added");
    }

}

