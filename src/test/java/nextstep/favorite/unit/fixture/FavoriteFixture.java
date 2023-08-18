package nextstep.favorite.unit.fixture;

import nextstep.favorite.domain.Favorite;
import nextstep.member.domain.Member;
import nextstep.subway.domain.Station;
import org.springframework.test.util.ReflectionTestUtils;

public class FavoriteFixture {
    private static Long id = 1L;

    public static void setFavoriteId(Favorite favorite) {
        if (favorite.getId() == null) {
            ReflectionTestUtils.setField(favorite, "id", id++);
        }
    }

    public static Favorite 즐겨찾기_등록(Long memberId, Long sourceId, Long targetId) {
        Favorite favorite = new Favorite(memberId, sourceId, targetId);
        setFavoriteId(favorite);
        return favorite;
    }
}
