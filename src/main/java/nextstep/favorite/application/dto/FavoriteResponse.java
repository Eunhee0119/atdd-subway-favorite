package nextstep.favorite.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import nextstep.favorite.domain.Favorite;
import nextstep.member.application.dto.MemberResponse;
import nextstep.subway.applicaion.dto.response.StationResponse;

@Getter
@AllArgsConstructor
public class FavoriteResponse {
    private Long id;
    private Long memberId;
    private Long sourceId;
    private Long targetId;

    public static FavoriteResponse of(Favorite favorite) {
        return new FavoriteResponse(favorite.getId(), favorite.getMemberId(), favorite.getSourceId(), favorite.getTargetId());
    }
}
