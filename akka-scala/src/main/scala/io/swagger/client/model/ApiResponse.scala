/**
 * Swagger Petstore
 * 123
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class ApiResponse (
  code: Option[Int] = None,
  `type`: Option[String] = None,
  message: Option[String] = None
) extends ApiModel


