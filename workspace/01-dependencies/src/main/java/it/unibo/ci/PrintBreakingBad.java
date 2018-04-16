package it.unibo.ci;
import java.io.IOException;
import org.apache.commons.io.IOUtils;
import com.google.common.base.Charsets;
import com.omertron.thetvdbapi.TheTVDBApi;
import com.omertron.thetvdbapi.model.Episode;
import com.omertron.thetvdbapi.model.Series;

public final class PrintBreakingBad {
    private static final String LANG = "it";
    private static final String SERIE = "Breaking Bad";
    private PrintBreakingBad() { }
    public static void main(String... args) throws ClassNotFoundException, IOException {
        final String key = IOUtils.toString(PrintBreakingBad.class.getResourceAsStream("/TheTVDBAPIKey"), Charsets.UTF_8);
        final TheTVDBApi api = new TheTVDBApi(key);
        api.searchSeries("Breaking Bad", LANG).stream()
            .filter(s -> s.getSeriesName().equals(SERIE))
            .map(Series::getId)
            .flatMap(s -> api.getAllEpisodes(s, LANG).stream())
            .map(Episode::getEpisodeName)
            .forEach(System.out::println);
    }
}
