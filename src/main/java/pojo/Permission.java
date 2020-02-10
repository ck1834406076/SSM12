package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Permission implements Serializable {
    private Integer permissionId;
    private String permissionName;
    private String permissionUrl;
}
