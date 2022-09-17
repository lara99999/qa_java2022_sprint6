import org.example.AlexTheLion;
import org.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

//comment for pull request develop branch
@RunWith(MockitoJUnitRunner.class)
public class AlexTheLionTest {

    @Mock
    Feline feline;

    @Test
    public void doesHaveManeReturnsTrue() throws Exception {
        AlexTheLion alexTheLion = new AlexTheLion("", feline);
        assertEquals(true, alexTheLion.doesHaveMane());
    }

    @Test
    public void getKittensReturns0() throws Exception {
        AlexTheLion alexTheLion = new AlexTheLion("", feline);
        assertEquals(0, alexTheLion.getKittens());
    }

    @Test
    public void getFriendsReturnsListOfFriends() throws Exception {
        AlexTheLion alexTheLion = new AlexTheLion("", feline);
        assertEquals(List.of("Марти", "Глория", "Мелман"), alexTheLion.getFriends());
    }

    @Test
    public void getPlaceOfLivingReturnsNewYorkZoo() throws Exception {
        AlexTheLion alexTheLion = new AlexTheLion("", feline);
        assertEquals("Нью-Йоркский зоопарк.", alexTheLion.getPlaceOfLiving());
    }

    @Test
    public void getFoodReturnsFoodForPredator() throws Exception {
        AlexTheLion alexTheLion = new AlexTheLion("", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), alexTheLion.getFood());
    }


}