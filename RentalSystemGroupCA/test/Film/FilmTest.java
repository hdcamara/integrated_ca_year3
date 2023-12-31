package Film;

import java.time.Duration;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;




/**
 *
 * @author diego
 */
public class FilmTest {
    
    @Test
    public void testFilm(){
        Film film = new Film(1, "The Test", 2023, "Francis For Testolla", Duration.ofHours(2), "PG", "Testing");
        assertNotNull(film);
        assertEquals(1, film.getId());
        assertEquals("The Test", film.getTitle());
    }
    
}
