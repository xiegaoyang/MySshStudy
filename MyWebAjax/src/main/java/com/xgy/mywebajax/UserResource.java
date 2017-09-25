package com.xgy.mywebajax;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Path("/users")
public class UserResource {

    private static Map<String, User> userMap = new HashMap<String, User>();//存储用户

    /**
     * 查询所有
     *
     * @return
     */
    @GET
//    @Produces(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        User u1 = new User("001", "WayLau", "26");
        User u2 = new User("002", "King", "23");
        User u3 = new User("003", "Susan", "21");

        userMap.put(u1.getUserId(), u1);
        userMap.put(u2.getUserId(), u2);
        userMap.put(u3.getUserId(), u3);

        users.addAll(userMap.values());
        return users;
    }

    @GET
    @Path("/getUserXml")
    @Produces(MediaType.APPLICATION_XML)
    public User getUserXml() {
        User user = new User();
        user.setAge("21");
        user.setUserId("004");
        user.setUserName("Amand");
        return user;
    }


    @GET
    @Path("/getUserJson")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUserJson() {
        User user = new User();
        user.setAge("27");
        user.setUserId("005");
        user.setUserName("Fmand");
        return user;
    }


    /**
     * 增加
     *
     * @param user
     */
    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_JSON)
    public User createStudent(User user) {
        userMap.put(user.getUserId(), user);
        return user;
    }


    /**
     * 增加
     *
     * @param user
     */
    @POST
    @Path("/user")
    public User addStudent(@FormParam("j") String j) {
        System.out.println(j);
        User user = new User();
        user.setAge("27");
        user.setUserId("005");
        user.setUserName("Fmand");
        return user;
    }


    /**
     * 删除
     *
     * @param user
     */
    @POST
    @Path("/delete/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public User delStudent(@PathParam("id") String id) {
        System.out.println(id);
        User user = new User();
        user.setAge("27");
        user.setUserId("005");
        user.setUserName("Fmand");
        return user;
    }


    /**
     * 删除
     *
     * @param id
     */
    @DELETE
    @Path("{id}")
    public void deleteStudent(@PathParam("id") String id) {
        userMap.remove(id);
    }


    /**
     * 修改
     *
     * @param user
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void updateStudent(User user) {
        userMap.put(user.getUserId(), user);
    }

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public User getUserById(@PathParam("id") String id) {
        User u = userMap.get(id);
        return u;
    }


}
