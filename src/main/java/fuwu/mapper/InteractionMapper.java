package fuwu.mapper;

import fuwu.po.Interaction;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: ypc
 * @Date: 2018/4/22 19:10
 * @Description:
 */
public interface InteractionMapper {
    public List<Interaction> getInterationlistByViewId(@Param("viewId") Integer viewId);

    Integer createInteraction(Interaction interaction);

    Integer deleteInteraction(Interaction interaction);

    Integer updateInteraction(Interaction interaction);

    Interaction getInterationById(@Param("id") Integer id);
}
