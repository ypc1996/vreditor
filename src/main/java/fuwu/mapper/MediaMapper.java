package fuwu.mapper;

import fuwu.po.Media;
import org.apache.ibatis.annotations.Param;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.List;

/**
 * @Author: ypc
 * @Date: 2018/4/28 0:32
 * @Description:
 */
public interface MediaMapper {
    public List<Media> getMediaListByInteractionId(@Param("interactionId") Integer interactionId );

    public Media getMediaUrlByMediaId(@Param("mediaId") Integer mediaId);

    public Integer addMedia(Media media);

    List<Media> getMediaListByIdList(@Param("mediaIntList") List<Integer> mediaIntList);
}
