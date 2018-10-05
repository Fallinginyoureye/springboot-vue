<template>
  <el-main>
    <el-row :gutter="20">
      <el-col :span="16" :offset="4">
        <div class="grid-content bg-purple">
          <el-table
            :data="tableData"
            border
            style="width: 100%">
            <el-table-column
              prop="stuId"
              label="ID"
              width="100">
            </el-table-column>
            <el-table-column
              prop="stuName"
              label="姓名"
              width="200">
            </el-table-column>
            <el-table-column
              prop="stuAge"
              label="年龄"
              width="150">
            </el-table-column>
            <el-table-column
              prop="stuSex"
              label="性别"
              width="150">
            </el-table-column>
            <el-table-column
              label="操作">
            </el-table-column>
          </el-table>
        </div>
      </el-col>
    </el-row>
  </el-main>
</template>

<script>
import {post, get} from '../../api/http.js'
export default {
  data () {
    return {
      tableData: []
    }
  },
  created () {
    this._getAllStu()
  },
  methods: {
    _getAllStu () {
      get('/admin/stu', {}).then((res) => {
        console.log(res)
        this.tableData = res.extend.stu
      })
    }
  }
}
</script>

<style lang="stylus" rel="stylesheet/stylus">

</style>
