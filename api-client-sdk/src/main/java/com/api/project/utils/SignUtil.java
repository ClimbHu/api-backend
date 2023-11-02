package com.api.project.utils;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;

/**
 * 签名生成工具类
 *
 * @author proberj
 */
public class SignUtil {

    /**
     * 生成签名算法
     *
     * @param body
     * @param secretKey
     * @return
     */
    public static String genSign(String body, String secretKey) {
        Digester md5 = new Digester(DigestAlgorithm.MD5);
        String content = body + "." + secretKey;
        return md5.digestHex(content);
    }
}
