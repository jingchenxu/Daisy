package org.deepwater.daisy.mapper.blog;

import java.util.List;
import org.apache.ibatis.jdbc.SQL;
import org.deepwater.daisy.entity.blog.Image;
import org.deepwater.daisy.entity.blog.ImageExample.Criteria;
import org.deepwater.daisy.entity.blog.ImageExample.Criterion;
import org.deepwater.daisy.entity.blog.ImageExample;

public class ImageSqlProvider {

    public String countByExample(ImageExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("T_DAISY_IMAGE");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Image record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("T_DAISY_IMAGE");
        
        if (record.getImageId() != null) {
            sql.VALUES("image_id", "#{imageId,jdbcType=INTEGER}");
        }
        
        if (record.getImageNumber() != null) {
            sql.VALUES("image_number", "#{imageNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getImageName() != null) {
            sql.VALUES("image_name", "#{imageName,jdbcType=VARCHAR}");
        }
        
        if (record.getImageUrl() != null) {
            sql.VALUES("image_url", "#{imageUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getImageIsIndex() != null) {
            sql.VALUES("image_is_index", "#{imageIsIndex,jdbcType=BIT}");
        }
        
        if (record.getImageDescription() != null) {
            sql.VALUES("image_description", "#{imageDescription,jdbcType=VARCHAR}");
        }
        
        if (record.getImageIsRemote() != null) {
            sql.VALUES("image_is_remote", "#{imageIsRemote,jdbcType=BIT}");
        }
        
        if (record.getImageCreatetime() != null) {
            sql.VALUES("image_createtime", "#{imageCreatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getImageCreator() != null) {
            sql.VALUES("image_creator", "#{imageCreator,jdbcType=VARCHAR}");
        }
        
        if (record.getImageType() != null) {
            sql.VALUES("image_type", "#{imageType,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Image record) {
        SQL sql = new SQL();
        sql.UPDATE("T_DAISY_IMAGE");
        
        if (record.getImageNumber() != null) {
            sql.SET("image_number = #{imageNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getImageName() != null) {
            sql.SET("image_name = #{imageName,jdbcType=VARCHAR}");
        }
        
        if (record.getImageUrl() != null) {
            sql.SET("image_url = #{imageUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getImageIsIndex() != null) {
            sql.SET("image_is_index = #{imageIsIndex,jdbcType=BIT}");
        }
        
        if (record.getImageDescription() != null) {
            sql.SET("image_description = #{imageDescription,jdbcType=VARCHAR}");
        }
        
        if (record.getImageIsRemote() != null) {
            sql.SET("image_is_remote = #{imageIsRemote,jdbcType=BIT}");
        }
        
        if (record.getImageCreatetime() != null) {
            sql.SET("image_createtime = #{imageCreatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getImageCreator() != null) {
            sql.SET("image_creator = #{imageCreator,jdbcType=VARCHAR}");
        }
        
        if (record.getImageType() != null) {
            sql.SET("image_type = #{imageType,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("image_id = #{imageId,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ImageExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}