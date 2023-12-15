package example.lineworks.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/** LINE WORKSのBotからのCallbackを受信する - 送信者情報格納DTO */
@Data
public class LwRequestSource {
  /** 送信元のユーザーID */
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String userId;
  /** 送信元のドメインID */
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Integer domainId;
  /** 送信元のチャンネルID */
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Integer channelId;
}
