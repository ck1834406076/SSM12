package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.crazycake.shiro.AuthCachePrincipal;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable, AuthCachePrincipal {
    private static final long serialVersionUID = -3207880482640325843L;
    private Integer userId;
    private String username;
    private String password;
    private String salt;
    private List<Role> roles;

    @Override
    public String getAuthCacheKey() {
        return null;
    }
}
