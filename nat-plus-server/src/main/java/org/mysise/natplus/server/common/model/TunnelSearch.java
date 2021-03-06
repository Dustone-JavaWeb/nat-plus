package org.mysise.natplus.server.common.model;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *  隧道请求参数
 * <p>
 *
 * @author fanwenjie
 * @since 2020/3/10 0:11
 */
@Data
public class TunnelSearch implements Serializable{

    private String name;

    private Integer type;

    private String hostName;

    private String token;
}
