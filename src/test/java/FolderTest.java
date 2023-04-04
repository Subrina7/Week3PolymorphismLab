import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FolderTest {

    Folder folder1;
    Folder folder2;
    @BeforeEach
    public void setUp(){
        folder1 = new Folder("Ringbinder", "Lilac", 4, false, "Cardboard");
        folder2 = new Folder("Card folder", "Red", 2, true, "Card");
    }

    @Test
    public void folderGetters(){
        assertThat(folder1.getPrice()).isEqualTo(4);
        assertThat(folder2.getName()).isEqualTo("Card folder");
        assertThat(folder1.getMaterial()).isEqualTo("Cardboard");
        assertThat(folder2.isCompact()).isEqualTo(true);
    }

    @Test
    public void canAddLabels(){
        assertThat(folder1.addLabels()).isEqualTo("Label added");
    }
}
