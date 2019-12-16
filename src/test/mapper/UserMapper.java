package test.mapper;

import org.apache.ibatis.annotations.Param;
import pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> selectUserListByNameAndRoleId(@Param("username") String username,
                                             @Param("roleId") Integer roleId);

}
